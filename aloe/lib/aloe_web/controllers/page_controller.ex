defmodule AloeWeb.PageController do
  use AloeWeb, :controller

  def home(conn, _params) do
    render(conn, :home, layout: false)
  end
end
