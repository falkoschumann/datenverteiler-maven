/*
 * <one line to give the library's name and a brief idea of what it does.>
 * Copyright (C) <year>  <name of author>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * Contact:
 * --------
 * <name of author>
 * <address of author>
 * <email of author>
 */

package de.bsvrz.sys.example;

import de.bsvrz.dav.daf.main.ClientDavInterface;
import de.bsvrz.sys.funclib.application.StandardApplication;
import de.bsvrz.sys.funclib.application.StandardApplicationRunner;
import de.bsvrz.sys.funclib.commandLineArgs.ArgumentList;

public class FooApp implements StandardApplication {

    public static void main(String[] args) {
        StandardApplicationRunner.run(new FooApp(), args);
    }

    @Override
    public void parseArguments(ArgumentList argumentList) throws Exception {
        // TODO implement method stub
    }

    @Override
    public void initialize(ClientDavInterface connection) throws Exception {
        // TODO implement method stub
    }

}
