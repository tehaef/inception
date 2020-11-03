/*
 * Copyright 2020
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.workload.config;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import de.tudarmstadt.ukp.inception.workload.extension.WorkloadManagerExtension;
import de.tudarmstadt.ukp.inception.workload.extension.WorkloadManagerExtensionPoint;
import de.tudarmstadt.ukp.inception.workload.extension.WorkloadManagerExtensionPointImpl;
import de.tudarmstadt.ukp.inception.workload.model.WorkloadManagementService;
import de.tudarmstadt.ukp.inception.workload.model.WorkloadManagementServiceImpl;
import de.tudarmstadt.ukp.inception.workload.model.WorkloadManager;
import de.tudarmstadt.ukp.inception.workload.workflow.WorkflowExtension;
import de.tudarmstadt.ukp.inception.workload.workflow.WorkflowExtensionPoint;
import de.tudarmstadt.ukp.inception.workload.workflow.WorkflowExtensionPointImpl;
import de.tudarmstadt.ukp.inception.workload.workflow.types.CurriculumWorkflowExtension;
import de.tudarmstadt.ukp.inception.workload.workflow.types.DefaultWorkflowExtension;
import de.tudarmstadt.ukp.inception.workload.workflow.types.RandomizedWorkflowExtension;

@Configuration
@Order(300)
public class WorkloadManagementAutoConfiguration<T>
{
    @Bean
    public WorkloadManagerExtensionPoint<T> workloadExtensionPoint(
            List<WorkloadManagerExtension<T>> aWorkloadExtensions)
    {
        return new WorkloadManagerExtensionPointImpl<>(aWorkloadExtensions);
    }

    @Bean
    public WorkflowExtensionPoint workflowExtensionPoint(List<WorkflowExtension> aWorkflowExtension)
    {
        return new WorkflowExtensionPointImpl(aWorkflowExtension);
    }

    @Bean
    public WorkloadManagementService workloadManagementService(EntityManager aEntityManager,
            WorkloadManagerExtensionPoint<T> aWorkloadManagerExtensionPoint)
    {
        return new WorkloadManagementServiceImpl(aEntityManager, aWorkloadManagerExtensionPoint);
    }

    @Bean
    public WorkloadManager workloadManager()
    {
        return new WorkloadManager();
    }

    @Bean
    public CurriculumWorkflowExtension curriculumWorkflowExtension()
    {
        return new CurriculumWorkflowExtension();
    }

    @Bean
    public DefaultWorkflowExtension defaultWorkflowExtension()
    {
        return new DefaultWorkflowExtension();
    }

    @Bean
    public RandomizedWorkflowExtension randomizedWorkflowExtension()
    {
        return new RandomizedWorkflowExtension();
    }




}
