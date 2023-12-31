<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright 2018 The casbin Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
namespace Palm\Lily\V1;

/**
 * The Casbin service definition.
 */
class CasbinStub {

    /**
     * @param \Palm\Lily\V1\NewEnforcerRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\NewEnforcerReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function NewEnforcer(
        \Palm\Lily\V1\NewEnforcerRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\NewEnforcerReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\NewAdapterRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\NewAdapterReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function NewAdapter(
        \Palm\Lily\V1\NewAdapterRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\NewAdapterReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EnforceRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function Enforce(
        \Palm\Lily\V1\EnforceRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\EmptyReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function LoadPolicy(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\EmptyReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\EmptyReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function SavePolicy(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\EmptyReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddNamedPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemovePolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveNamedPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveFilteredPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveFilteredNamedPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetPolicy(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetNamedPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetFilteredPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetFilteredNamedPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddNamedGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveNamedGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveFilteredGroupingPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function RemoveFilteredNamedGroupingPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetGroupingPolicy(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetNamedGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetFilteredGroupingPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetFilteredNamedGroupingPolicy(
        \Palm\Lily\V1\FilteredPolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllSubjects(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllNamedSubjects(
        \Palm\Lily\V1\SimpleGetRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllObjects(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllNamedObjects(
        \Palm\Lily\V1\SimpleGetRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllActions(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllNamedActions(
        \Palm\Lily\V1\SimpleGetRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllRoles(
        \Palm\Lily\V1\EmptyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetAllNamedRoles(
        \Palm\Lily\V1\SimpleGetRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasNamedPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasNamedGroupingPolicy(
        \Palm\Lily\V1\PolicyRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetDomains(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetRolesForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetImplicitRolesForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\ArrayReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetUsersForRole(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\ArrayReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasRoleForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddRoleForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeleteRoleForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeleteRolesForUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeleteUser(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\EmptyReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeleteRole(
        \Palm\Lily\V1\UserRoleRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\EmptyReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetPermissionsForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\Array2DReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function GetImplicitPermissionsForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\Array2DReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeletePermission(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function AddPermissionForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeletePermissionForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function DeletePermissionsForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $request client request
     * @param \Grpc\ServerContext $context server request context
     * @return \Palm\Lily\V1\BoolReply for response data, null if if error occured
     *     initial metadata (if any) and status (if not ok) should be set to $context
     */
    public function HasPermissionForUser(
        \Palm\Lily\V1\PermissionRequest $request,
        \Grpc\ServerContext $context
    ): ?\Palm\Lily\V1\BoolReply {
        $context->setStatus(\Grpc\Status::unimplemented());
        return null;
    }

    /**
     * Get the method descriptors of the service for server registration
     *
     * @return array of \Grpc\MethodDescriptor for the service methods
     */
    public final function getMethodDescriptors(): array
    {
        return [
            '/palm.lily.v1.Casbin/NewEnforcer' => new \Grpc\MethodDescriptor(
                $this,
                'NewEnforcer',
                '\Palm\Lily\V1\NewEnforcerRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/NewAdapter' => new \Grpc\MethodDescriptor(
                $this,
                'NewAdapter',
                '\Palm\Lily\V1\NewAdapterRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/Enforce' => new \Grpc\MethodDescriptor(
                $this,
                'Enforce',
                '\Palm\Lily\V1\EnforceRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/LoadPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'LoadPolicy',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/SavePolicy' => new \Grpc\MethodDescriptor(
                $this,
                'SavePolicy',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'AddPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'AddNamedPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemovePolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemovePolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveNamedPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveFilteredPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveFilteredPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveFilteredNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveFilteredNamedPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetPolicy',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetNamedPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetFilteredPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetFilteredPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetFilteredNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetFilteredNamedPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'AddGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'AddNamedGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveNamedGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveFilteredGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveFilteredGroupingPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/RemoveFilteredNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'RemoveFilteredNamedGroupingPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetGroupingPolicy',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetNamedGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetFilteredGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetFilteredGroupingPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetFilteredNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'GetFilteredNamedGroupingPolicy',
                '\Palm\Lily\V1\FilteredPolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllSubjects' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllSubjects',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllNamedSubjects' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllNamedSubjects',
                '\Palm\Lily\V1\SimpleGetRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllObjects' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllObjects',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllNamedObjects' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllNamedObjects',
                '\Palm\Lily\V1\SimpleGetRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllActions' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllActions',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllNamedActions' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllNamedActions',
                '\Palm\Lily\V1\SimpleGetRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllRoles' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllRoles',
                '\Palm\Lily\V1\EmptyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetAllNamedRoles' => new \Grpc\MethodDescriptor(
                $this,
                'GetAllNamedRoles',
                '\Palm\Lily\V1\SimpleGetRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'HasPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasNamedPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'HasNamedPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'HasGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasNamedGroupingPolicy' => new \Grpc\MethodDescriptor(
                $this,
                'HasNamedGroupingPolicy',
                '\Palm\Lily\V1\PolicyRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetDomains' => new \Grpc\MethodDescriptor(
                $this,
                'GetDomains',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetRolesForUser' => new \Grpc\MethodDescriptor(
                $this,
                'GetRolesForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetImplicitRolesForUser' => new \Grpc\MethodDescriptor(
                $this,
                'GetImplicitRolesForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetUsersForRole' => new \Grpc\MethodDescriptor(
                $this,
                'GetUsersForRole',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasRoleForUser' => new \Grpc\MethodDescriptor(
                $this,
                'HasRoleForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddRoleForUser' => new \Grpc\MethodDescriptor(
                $this,
                'AddRoleForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeleteRoleForUser' => new \Grpc\MethodDescriptor(
                $this,
                'DeleteRoleForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeleteRolesForUser' => new \Grpc\MethodDescriptor(
                $this,
                'DeleteRolesForUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeleteUser' => new \Grpc\MethodDescriptor(
                $this,
                'DeleteUser',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeleteRole' => new \Grpc\MethodDescriptor(
                $this,
                'DeleteRole',
                '\Palm\Lily\V1\UserRoleRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetPermissionsForUser' => new \Grpc\MethodDescriptor(
                $this,
                'GetPermissionsForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/GetImplicitPermissionsForUser' => new \Grpc\MethodDescriptor(
                $this,
                'GetImplicitPermissionsForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeletePermission' => new \Grpc\MethodDescriptor(
                $this,
                'DeletePermission',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/AddPermissionForUser' => new \Grpc\MethodDescriptor(
                $this,
                'AddPermissionForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeletePermissionForUser' => new \Grpc\MethodDescriptor(
                $this,
                'DeletePermissionForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/DeletePermissionsForUser' => new \Grpc\MethodDescriptor(
                $this,
                'DeletePermissionsForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
            '/palm.lily.v1.Casbin/HasPermissionForUser' => new \Grpc\MethodDescriptor(
                $this,
                'HasPermissionForUser',
                '\Palm\Lily\V1\PermissionRequest',
                \Grpc\MethodDescriptor::UNARY_CALL
            ),
        ];
    }

}
