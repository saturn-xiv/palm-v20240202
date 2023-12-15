execute_process(COMMAND git describe --tags --always --dirty
    OUTPUT_VARIABLE GIT_VERSION
    ERROR_QUIET
)
string(STRIP "${GIT_VERSION}" GIT_VERSION)
string(TIMESTAMP BUILD_TIME UTC)
configure_file(gourd/include/palm/version.h.in ${PROJECT_SOURCE_DIR}/gourd/include/palm/version.hpp)
