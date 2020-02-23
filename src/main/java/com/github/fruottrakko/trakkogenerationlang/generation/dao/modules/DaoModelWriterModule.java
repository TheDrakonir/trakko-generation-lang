package com.github.fruottrakko.trakkogenerationlang.generation.dao.modules;

import java.io.File;

import com.github.fruottrakko.trakkogenerationlang.files.tgl.types.Fields;
import com.github.fruottrakko.trakkogenerationlang.files.tglmap.types.TypeAtlas;
import com.github.fruottrakko.trakkogenerationlang.modules.BaseModule;

public interface DaoModelWriterModule extends BaseModule{
    
    // Invoke lang module generator with file refernece, fields, and type atlas as arguments

    public void writeDaoModelFileContent(File modelFile, Fields modelFields, TypeAtlas langTypeAtlas);

}