defmodule Fig.Application do
  # See https://hexdocs.pm/elixir/Application.html
  # for more information on OTP Applications
  @moduledoc false

  use Application

  @impl true
  def start(_type, _args) do
    children = [
      FigWeb.Telemetry,
      Fig.Repo,
      {DNSCluster, query: Application.get_env(:fig, :dns_cluster_query) || :ignore},
      {Phoenix.PubSub, name: Fig.PubSub},
      # Start the Finch HTTP client for sending emails
      {Finch, name: Fig.Finch},
      # Start a worker by calling: Fig.Worker.start_link(arg)
      # {Fig.Worker, arg},
      # Start to serve requests, typically the last entry
      FigWeb.Endpoint
    ]

    # See https://hexdocs.pm/elixir/Supervisor.html
    # for other strategies and supported options
    opts = [strategy: :one_for_one, name: Fig.Supervisor]
    Supervisor.start_link(children, opts)
  end

  # Tell Phoenix to update the endpoint configuration
  # whenever the application is updated.
  @impl true
  def config_change(changed, _new, removed) do
    FigWeb.Endpoint.config_change(changed, removed)
    :ok
  end
end
