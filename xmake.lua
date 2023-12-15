add_rules("mode.debug", "mode.release")

target("salvia")
    set_kind("binary")
    set_languages("c++20")
    add_files("src/salvia.cpp")

target("fig")
    set_kind("binary")
    set_languages("c++20")
    add_files("src/fig.cpp")

target("loquat")
    set_kind("binary")
    set_languages("c++20")
    add_files("src/loquat.cpp")
