add_rules("mode.debug", "mode.release")

add_requires("spdlog", "argparse", 
    "libevent", "boost",
    "toml++", 
    "amqp-cpp", "pahomqttcpp", "cppzmq",
    "redis-plus-plus", "sqlitecpp", "libpqxx",
    "cpp-httplib", "nlohmann_json", "inja",
    "grpc"
)

target("salvia")
    set_kind("binary")
    set_languages("c++20")
    add_packages("spdlog", "argparse", "sqlitecpp")
    add_includedirs("gourd/include", "salvia/include")
    add_files("salvia/src/main.cpp")

target("fig")
    set_kind("binary")
    set_languages("c++20")
    add_packages("spdlog", "argparse", "toml++", "nlohmann_json", "inja",
        "amqp-cpp", "redis-plus-plus", "sqlitecpp", "libpqxx"
    )
    add_includedirs("gourd/include", "fig/include")
    add_files("fig/src/main.cpp")

target("loquat")
    set_kind("binary")
    set_languages("c++20")
    add_packages("libevent")
    add_includedirs("gourd/include", "loquat/include")
    add_files("loquat/src/main.cpp")
