package de.jroene.vrapper.vim.action;

import de.jroene.vrapper.vim.VimEmulator;

/**
 * Switches to insert mode.
 *
 * @author Matthias Radig
 */
public class InsertModeAction extends TokenAndAction {

    public void execute(VimEmulator vim) {
        vim.toInsertMode();
    }

}
