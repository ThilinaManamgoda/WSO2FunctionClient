/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.function.models;

public class API_UPDATE {
    private String API_Context;

    private String API_Description;

    private String Event;

    private String API_LCStatus;

    private String API_Version;

    private String Username;

    private String API_Name;

    private String Component;

    private String Event_Time;

    private String API_Id;

    public String getAPI_Context() {
        return API_Context;
    }

    public void setAPI_Context(String API_Context) {
        this.API_Context = API_Context;
    }

    public String getAPI_Description() {
        return API_Description;
    }

    public void setAPI_Description(String API_Description) {
        this.API_Description = API_Description;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String Event) {
        this.Event = Event;
    }

    public String getAPI_LCStatus() {
        return API_LCStatus;
    }

    public void setAPI_LCStatus(String API_LCStatus) {
        this.API_LCStatus = API_LCStatus;
    }

    public String getAPI_Version() {
        return API_Version;
    }

    public void setAPI_Version(String API_Version) {
        this.API_Version = API_Version;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getAPI_Name() {
        return API_Name;
    }

    public void setAPI_Name(String API_Name) {
        this.API_Name = API_Name;
    }

    public String getComponent() {
        return Component;
    }

    public void setComponent(String Component) {
        this.Component = Component;
    }

    public String getEvent_Time() {
        return Event_Time;
    }

    public void setEvent_Time(String Event_Time) {
        this.Event_Time = Event_Time;
    }

    public String getAPI_Id() {
        return API_Id;
    }

    public void setAPI_Id(String API_Id) {
        this.API_Id = API_Id;
    }
}
