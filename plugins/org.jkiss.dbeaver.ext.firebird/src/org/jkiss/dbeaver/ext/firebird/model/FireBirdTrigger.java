/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2021 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.firebird.model;

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;
import org.jkiss.dbeaver.model.meta.Property;

/**
 * FireBirdDataSource
 */
public class FireBirdTrigger extends GenericTrigger {

    private FireBirdTriggerType type;
    private int sequence;

    public FireBirdTrigger(GenericStructContainer container, GenericTableBase table, String name, String description, FireBirdTriggerType type, int sequence) {
        super(container, table, name, description);

        this.type = type;
        this.sequence = sequence;
    }

    public FireBirdTriggerType getType() {
        return type;
    }

    @Property(viewable = true, editable = true, updatable = false, order = 10)
    public String getTriggerType() {
        return type.getDisplayName();
    }

    @Property(viewable = true, editable = true, updatable = false, order = 11)
    public int getSequence() {
        return sequence;
    }
}
