/*
 * Copyright 2009 Andrew Pietsch 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at 
 *      
 *      http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing permissions 
 * and limitations under the License. 
 */

package com.dragome.forms.bindings.client.form.validation;

import com.dragome.model.interfaces.EventHandler;

/**
 * Created by IntelliJ IDEA.
 * User: andrew
 * Date: Jul 1, 2009
 * Time: 9:58:41 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IndexedValidationHandler extends EventHandler
{

	/**
	 * Called when {@link ValueChangeEvent} is fired.
	 * 
	 * @param event the {@link ValueChangeEvent} that was fired
	 */
	void onValidate(IndexedValidationEvent event);
}