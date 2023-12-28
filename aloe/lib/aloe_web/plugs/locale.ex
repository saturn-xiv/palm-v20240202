defmodule AloeWeb.Plugs.Locale do
  import Plug.Conn

  @locales ["en-US", "zh-Hans"]

  def init(default), do: default

  def call(%Plug.Conn{params: %{"locale" => locale}} = conn, _default) when locale in @locales do
    IO.puts("$$$ #{locale}")

    case locale do
      "en-US" -> Gettext.put_locale("en_US")
      "zh-Hans" -> Gettext.put_locale("zh_Hans")
    end

    assign(conn, :locale, locale)
  end

  def call(conn, default) do
    Gettext.put_locale("en_US")
    assign(conn, :locale, default)
  end
end
