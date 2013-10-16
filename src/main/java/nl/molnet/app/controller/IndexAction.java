package nl.molnet.app.controller;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;

@MadvocAction
public class IndexAction {

	@In
	String name;

	@Out
	String world;

	@Action
	public void view() {
		if (name != null) {
			world = name.toUpperCase();
		}
	}
}
