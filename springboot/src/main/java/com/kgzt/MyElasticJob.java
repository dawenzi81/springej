package com.kgzt;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {
    
    
    public void execute(ShardingContext context) {
    	System.out.println("--"+context.getJobName()+"-"+context.getShardingTotalCount()+"-"+context.getShardingItem());
        switch (context.getShardingItem()) {
            case 0: 
                
                break;
            case 1: 
                // do something by sharding item 1
                break;
            case 2: 
                // do something by sharding item 2
                break;
            // case n: ...
        }
    }
}