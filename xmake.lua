add_rules("mode.debug", "mode.release")

add_requireconfs("*", {system = false, configs = {cxxflags = "-std=c++20"}})

-- add_requires("abseil", {configs = {cxxflags = "-std=c++17", envs = {ABSL_PROPAGATE_CXX_STD = "ON"}}})
add_requires("grpc", {configs = {cxxflags = "-std=c++14", envs = {ABSL_PROPAGATE_CXX_STD = "ON"}}})

add_requires(
    "spdlog", "argparse", 
    "openssl3", "libevent", 
    "toml++", 
    "amqp-cpp", "pahomqttc", "pahomqttcpp", "zeromq", "cppzmq",
    "sqlitecpp", "mariadb-connector-c", "libpqxx", "hiredis", "redis-plus-plus", "mongo-c-driver",
    "cpp-httplib", "nlohmann_json", "inja"
)
-- FIXME mongo-cxx-driver mysqlpp


target("salvia")
    set_kind("binary")
    set_languages("c++20")
    add_packages("spdlog", "argparse", "sqlitecpp")
    add_includedirs("gourd/include", "salvia/include")
    add_files("salvia/src/*.cpp", "gourd/src/*.cc")

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
    add_files("fig/src/*.cpp", "gourd/src/*")

target("loquat")
    set_kind("binary")
    set_languages("c++20")
    add_packages("spdlog", "argparse", "openssl3", "boost", "libevent")
    add_includedirs("gourd/include", "loquat/include")
    add_files("loquat/src/*.cpp", "gourd/src/*.cpp")
