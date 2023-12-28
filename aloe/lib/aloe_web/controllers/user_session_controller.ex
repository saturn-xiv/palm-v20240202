defmodule AloeWeb.User.SessionController do
  use AloeWeb, :controller

  def new(conn, params) do
    IO.puts("$$$ #{params["locale"]}")
    render(conn, :new, layout: false)
  end

  def create(conn, _params) do
    render(conn, :home)
  end

  def delete(conn, _params) do
    render(conn, :home)
  end
end
