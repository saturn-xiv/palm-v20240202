#include "fig/application.hpp"

int main(int argc, char** argv) {
  spdlog::set_level(spdlog::level::debug);

  spdlog::info("Welcome {}", palm::GIT_VERSION);

  return 0;
}
