/*
 * Copyright 2016-2017 Andres Almiray
 *
 * This file is part of Griffon Examples
 *
 * Griffon Examples is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Griffon Examples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Griffon Examples. If not, see <http://www.gnu.org/licenses/>.
 */
package sample.javafx.java;

import griffon.util.AbstractMapResourceBundle;
import griffon.util.CollectionUtils;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        CollectionUtils.map(entries)
            .e("application", CollectionUtils.map()
                .e("title", "JavaFX + Java")
                .e("startupGroups", asList("sample"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", CollectionUtils.map()
                .e("sample", CollectionUtils.map()
                    .e("model", "sample.javafx.java.SampleModel")
                    .e("view", "sample.javafx.java.SampleView")
                    .e("controller", "sample.javafx.java.SampleController")
                )
            );
    }
}
