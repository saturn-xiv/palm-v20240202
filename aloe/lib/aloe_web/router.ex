defmodule AloeWeb.Router do
  use AloeWeb, :router

  pipeline :browser do
    plug(:accepts, ["html"])
    plug(:fetch_session)
    plug(:fetch_live_flash)
    plug(:put_root_layout, html: {AloeWeb.Layouts, :root})
    plug(:protect_from_forgery)
    plug(:put_secure_browser_headers)
  end

  pipeline :api do
    plug(:accepts, ["json"])
  end

  scope "/", AloeWeb do
    pipe_through(:browser)

    get("/", PageController, :home)
  end

  scope "/users", AloeWeb.User do
    pipe_through(:browser)

    get("/sign-in", SessionController, :new)
    post("/sign-in", SessionController, :create)
    delete("/sign-out", SessionController, :delete)
    resources("/logs", LogController, only: [:index])
  end

  scope "/router", AloeWeb.Router do
    pipe_through(:browser)

    get("/status", DashboardController, :show)
    post("/reboot", DashboardController, :reboot)
    post("/apply", DashboardController, :apply)

    get("/lan", WanController, :edit)
    post("/lan", WanController, :update)
    get("/dmz", DmzController, :edit)
    post("/dmz", DmzController, :update)
    get("/guest", GuestController, :edit)
    post("/guest", GuestController, :update)
    resources("/wan", WanController, only: [:index, :edit, :update])

    resources("/clients", ClientController, only: [:index, :edit, :update, :delete])
  end

  # Other scopes may use custom stacks.
  # scope "/api", AloeWeb do
  #   pipe_through :api
  # end

  # Enable LiveDashboard and Swoosh mailbox preview in development
  if Application.compile_env(:aloe, :dev_routes) do
    # If you want to use the LiveDashboard in production, you should put
    # it behind authentication and allow only admins to access it.
    # If your application does not have an admins-only section yet,
    # you can use Plug.BasicAuth to set up some basic authentication
    # as long as you are also using SSL (which you should anyway).
    import Phoenix.LiveDashboard.Router

    scope "/dev" do
      pipe_through(:browser)

      live_dashboard("/dashboard", metrics: AloeWeb.Telemetry)
      forward("/mailbox", Plug.Swoosh.MailboxPreview)
    end
  end
end
