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
class CasbinClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Palm\Lily\V1\NewEnforcerRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function NewEnforcer(\Palm\Lily\V1\NewEnforcerRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/NewEnforcer',
        $argument,
        ['\Palm\Lily\V1\NewEnforcerReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\NewAdapterRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function NewAdapter(\Palm\Lily\V1\NewAdapterRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/NewAdapter',
        $argument,
        ['\Palm\Lily\V1\NewAdapterReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EnforceRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function Enforce(\Palm\Lily\V1\EnforceRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/Enforce',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function LoadPolicy(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/LoadPolicy',
        $argument,
        ['\Palm\Lily\V1\EmptyReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SavePolicy(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/SavePolicy',
        $argument,
        ['\Palm\Lily\V1\EmptyReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddNamedPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemovePolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemovePolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveNamedPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveFilteredPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveFilteredPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveFilteredNamedPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveFilteredNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetPolicy(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetNamedPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetFilteredPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetFilteredPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetFilteredNamedPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetFilteredNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddNamedGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveNamedGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveFilteredGroupingPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveFilteredGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function RemoveFilteredNamedGroupingPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/RemoveFilteredNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetGroupingPolicy(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetNamedGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetFilteredGroupingPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetFilteredGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\FilteredPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetFilteredNamedGroupingPolicy(\Palm\Lily\V1\FilteredPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetFilteredNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllSubjects(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllSubjects',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllNamedSubjects(\Palm\Lily\V1\SimpleGetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllNamedSubjects',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllObjects(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllObjects',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllNamedObjects(\Palm\Lily\V1\SimpleGetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllNamedObjects',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllActions(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllActions',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllNamedActions(\Palm\Lily\V1\SimpleGetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllNamedActions',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllRoles(\Palm\Lily\V1\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllRoles',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\SimpleGetRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAllNamedRoles(\Palm\Lily\V1\SimpleGetRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetAllNamedRoles',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasNamedPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasNamedPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasNamedGroupingPolicy(\Palm\Lily\V1\PolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasNamedGroupingPolicy',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetDomains(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetDomains',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetRolesForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetRolesForUser',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetImplicitRolesForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetImplicitRolesForUser',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetUsersForRole(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetUsersForRole',
        $argument,
        ['\Palm\Lily\V1\ArrayReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasRoleForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasRoleForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddRoleForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddRoleForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteRoleForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeleteRoleForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteRolesForUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeleteRolesForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteUser(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeleteUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\UserRoleRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteRole(\Palm\Lily\V1\UserRoleRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeleteRole',
        $argument,
        ['\Palm\Lily\V1\EmptyReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetPermissionsForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetPermissionsForUser',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetImplicitPermissionsForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/GetImplicitPermissionsForUser',
        $argument,
        ['\Palm\Lily\V1\Array2DReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeletePermission(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeletePermission',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function AddPermissionForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/AddPermissionForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeletePermissionForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeletePermissionForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeletePermissionsForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/DeletePermissionsForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Palm\Lily\V1\PermissionRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function HasPermissionForUser(\Palm\Lily\V1\PermissionRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/palm.lily.v1.Casbin/HasPermissionForUser',
        $argument,
        ['\Palm\Lily\V1\BoolReply', 'decode'],
        $metadata, $options);
    }

}
