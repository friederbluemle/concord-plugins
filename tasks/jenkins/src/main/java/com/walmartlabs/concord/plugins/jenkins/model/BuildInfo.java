package com.walmartlabs.concord.plugins.jenkins.model;

/*-
 * *****
 * Concord
 * -----
 * Copyright (C) 2017 - 2019 Walmart Inc.
 * -----
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =====
 */

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildInfo {

    private final boolean building;

    private final String result;

    @JsonCreator
    public BuildInfo(@JsonProperty("building") boolean building,
                     @JsonProperty("result") String result) {

        this.building = building;
        this.result = result;
    }

    public boolean isBuilding() {
        return building;
    }

    public String getResult() {
        return result;
    }
}
