defmodule AloeWeb.PageHelper do
  def path_with_locale(path, locale) do
    Regex.replace(~r/[-[:alpha:]]+/, path, fn _ -> "#{locale}" end, global: false)
  end
end
