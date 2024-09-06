package io.github.linghengqian.filter.testd;

import com.alibaba.druid.filter.stat.StatFilter;

@SuppressWarnings("unused")
public class CustomStatFilter extends StatFilter {
    public CustomStatFilter() {
        super.setMergeSql(true);
        super.setSlowSqlMillis(3 * 1000);
        super.setLogSlowSql(false);
    }
}
