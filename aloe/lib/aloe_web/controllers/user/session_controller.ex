defmodule AloeWeb.User.SessionController do
  use AloeWeb, :controller

  def new(conn, _params) do
    render(conn, :new,
      layout: false,
      page_title: AloeWeb.Gettext.dgettext("pages", "users.sign-in.title")
    )
  end

  def create(user, params \\ :empty) do
    IO.puts("#{user}")
  end

  def delete(conn, _params) do
    render(conn, :home)
  end
end
