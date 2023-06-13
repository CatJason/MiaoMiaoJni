cmake_minimum_required(VERSION 3.23.1)

# 设置 C++ 标准
set(CMAKE_CXX_STANDARD 11)

# 添加一个库目标
add_library(
    native-lib SHARED src/main/cpp/native-lib.cpp
)

# 链接系统库
target_link_libraries(
    native-lib
    log
)

