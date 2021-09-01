/*
 * Licensed to the Technische Universität Darmstadt under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The Technische Universität Darmstadt
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.experimental.api.model;

import java.util.List;

import de.tudarmstadt.ukp.clarin.webanno.api.annotation.model.VID;

public class Arc
{
    private VID id;
    private VID sourceId;
    private VID targetId;
    private String sourceCoveredText;
    private String targetCoveredText;
    private String color;
    private String type;
    private List<String> features;

    public Arc(VID aId, VID aSourceId, VID aTargetId, String aColor,
               String aSourceCoveredText, String aTargetCoveredText, String aType, List<String> aFeatures)
    {
        id = aId;
        sourceId = aSourceId;
        targetId = aTargetId;
        color = aColor;
        sourceCoveredText = aSourceCoveredText;
        targetCoveredText = aTargetCoveredText;
        features = aFeatures;
    }

    public VID getId()
    {
        return id;
    }

    public void setId(VID aId)
    {
        id = aId;
    }

    public VID getSourceId() {
        return sourceId;
    }

    public void setSourceId(VID aSourceId)
    {
        sourceId = aSourceId;
    }

    public VID getTargetId()
    {
        return targetId;
    }

    public void setTargetId(VID aTargetId)
    {
        targetId = aTargetId;
    }

    public String getSourceCoveredText()
    {
        return sourceCoveredText;
    }

    public void setSourceCoveredText(String aSourceCoveredText)
    {
        sourceCoveredText = aSourceCoveredText;
    }

    public String getTargetCoveredText()
    {
        return targetCoveredText;
    }

    public void setTargetCoveredText(String aTargetCoveredText)
    {
        targetCoveredText = aTargetCoveredText;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String aColor)
    {
        color = aColor;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String aType)
    {
        type = aType;
    }

    public List<String> getFeatures()
    {
        return features;
    }

    public void setFeatures(List<String> aFeatures)
    {
        features = aFeatures;
    }
}
