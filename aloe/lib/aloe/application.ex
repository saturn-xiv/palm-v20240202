defmodule Aloe.Application do
  # See https://hexdocs.pm/elixir/Application.html
  # for more information on OTP Applications
  @moduledoc false

  use Application

  @impl true
  def start(_type, _args) do
    children = [
      AloeWeb.Telemetry,
      Aloe.Repo,
      {DNSCluster, query: Application.get_env(:aloe, :dns_cluster_query) || :ignore},
      {Phoenix.PubSub, name: Aloe.PubSub},
      # Start the Finch HTTP client for sending emails
      {Finch, name: Aloe.Finch},
      # Start a worker by calling: Aloe.Worker.start_link(arg)
      # {Aloe.Worker, arg},
      # Start to serve requests, typically the last entry
      AloeWeb.Endpoint
    ]

    # See https://hexdocs.pm/elixir/Supervisor.html
    # for other strategies and supported options
    opts = [strategy: :one_for_one, name: Aloe.Supervisor]
    Supervisor.start_link(children, opts)
  end

  # Tell Phoenix to update the endpoint configuration
  # whenever the application is updated.
  @impl true
  def config_change(changed, _new, removed) do
    AloeWeb.Endpoint.config_change(changed, removed)
    :ok
  end
end
