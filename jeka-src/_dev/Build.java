package _dev;

import dev.jeka.core.tool.KBean;
import dev.jeka.core.tool.JkDep;
import dev.jeka.core.tool.builtins.base.BaseKBean;

// Declare non-prod dependencies here (build, tests, compile-only deps)
@JkDep("org.junit.jupiter:junit-jupiter:5.11.4")
class Build extends KBean {

    final BaseKBean baseKBean = load(BaseKBean.class);

    @Override
    protected void init() {
    }

}