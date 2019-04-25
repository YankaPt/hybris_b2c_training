/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.training.constants.TrainingcommerceservicesConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class TrainingcommerceservicesManager extends GeneratedTrainingcommerceservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( TrainingcommerceservicesManager.class.getName() );
	
	public static final TrainingcommerceservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingcommerceservicesManager) em.getExtension(TrainingcommerceservicesConstants.EXTENSIONNAME);
	}
	
}
