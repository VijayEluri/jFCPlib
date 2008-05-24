/*
 * fcplib - HighLevelCallbackListener.java -
 * Copyright © 2008 David Roden
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package net.pterodactylus.fcp.highlevel;

import java.util.EventListener;

/**
 * Interface for objects that want to be notified as soon as a
 * {@link HighLevelCallback} received a result.
 * 
 * @param <R>
 *            The type of the high-level operation progress
 * @author David ‘Bombe’ Roden &lt;bombe@freenetproject.org&gt;
 */
public interface HighLevelCallbackListener<R extends HighLevelResult> extends EventListener {

	/**
	 * Notifies a listener that the given callback received a result. Use
	 * {@link HighLevelCallback#getResult()} to retrieve the result.
	 * 
	 * @param highLevelCallback
	 *            The callback that received a result
	 */
	public void gotResult(HighLevelCallback<R> highLevelCallback);

}
