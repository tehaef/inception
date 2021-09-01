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
package de.tudarmstadt.ukp.inception.experimental.api.messages.request;

import de.tudarmstadt.ukp.inception.experimental.api.model.Viewport;

public class DocumentRequest
{
    private String annotatorName;
    private long projectId;
    private long sourceDocumentId;
    private Viewport viewport;

    public String getAnnotatorName()
    {
        return annotatorName;
    }

    public void setAnnotatorName(String aAnnotatorName)
    {
        annotatorName = aAnnotatorName;
    }

    public long getProjectId()
    {
        return projectId;
    }

    public void setProjectId(long aProjectId)
    {
        projectId = aProjectId;
    }

    public long getSourceDocumentId()
    {
        return sourceDocumentId;
    }

    public void setSourceDocumentId(long aSourceDocumentId)
    {
        sourceDocumentId = aSourceDocumentId;
    }

    public Viewport getViewport()
    {
        return viewport;
    }

    public void setViewport(Viewport aViewport)
    {
        viewport = aViewport;
    }

}
