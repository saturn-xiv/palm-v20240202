add_rules("mode.debug", "mode.release")

add_requires("spdlog", "argparse", 
    "openssl3", "libevent", 
    "toml++", 
    "amqp-cpp", "pahomqttcpp", "cppzmq",
    "sqlitecpp", "mariadb-connector-c", "libpqxx", "redis-plus-plus", "mongo-c-driver",
    "cpp-httplib", "nlohmann_json", "inja",
    "grpc"
)
-- FIXME mongo-cxx-driver mysqlpp boost

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
        "amqp-cpp", "pahomqttcpp", "cppzmq",
        "sqlitecpp", "mariadb-connector-c", "libpqxx", "redis-plus-plus", "mongo-c-driver",
        "cpp-httplib", "nlohmann_json", "inja",
        "grpc"
    )
    add_includedirs("gourd/include", "fig/include")
    add_files("fig/src/main.cpp")

target("loquat")
    set_kind("binary")
    set_languages("c++20")
    add_packages("spdlog", "argparse", "openssl3", "libevent")
    add_includedirs("gourd/include", "loquat/include")
    add_files("loquat/src/main.cpp")
