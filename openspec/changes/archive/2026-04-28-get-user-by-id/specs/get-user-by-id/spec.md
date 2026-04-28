## ADDED Requirements

### Requirement: Get User By ID
系统 SHALL 提供通过用户ID查询用户信息的接口 GET /api/users/{userId}

#### Scenario: Successful query with valid userId
- **WHEN** GET /api/users/{userId} 请求中 userId > 0 且用户存在
- **THEN** 返回 HTTP 200 和 ApiResponse，包含 userId、name、age

#### Scenario: Invalid userId (less than or equal to zero)
- **WHEN** GET /api/users/{userId} 请求中 userId <= 0
- **THEN** 返回 HTTP 400 和 ApiResponse with code=INVALID_PARAM

#### Scenario: User not found
- **WHEN** GET /api/users/{userId} 请求中 userId > 0 但用户不存在
- **THEN** 返回 HTTP 404 和 ApiResponse with code=USER_NOT_FOUND

### Requirement: Unified API Response
所有接口 SHALL 返回统一的 ApiResponse 结构

#### Scenario: Success response structure
- **WHEN** 请求成功
- **THEN** ApiResponse.code=SUCCESS, ApiResponse.data 包含用户信息

#### Scenario: Error response structure
- **WHEN** 请求失败
- **THEN** ApiResponse.code=错误码, ApiResponse.message=错误信息
