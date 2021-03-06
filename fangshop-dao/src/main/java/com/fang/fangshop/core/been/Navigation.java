package com.fang.fangshop.core.been;

import com.fang.fangshop.core.cache.RedisCache;
import com.fang.fangshop.core.cache.RedisFieldNotCache;
import com.fang.fangshop.core.cache.RedisQuery;
import com.fang.fangshop.core.common.PageModel;

@RedisCache
public class Navigation extends PageModel {
	@RedisFieldNotCache
	private static final String className = "navigation";
	@RedisFieldNotCache
	private static final String primaryKey = "id";
    /** t_navigation.id */
    private Integer id;
    @RedisQuery
    /** t_navigation.name */
    private String name;

    /** t_navigation.target */
    private String target;

    /** t_navigation.position */
    private String position;

    /** t_navigation.desc1 */
    private String desc1;

    /** t_navigation.order1 */
    private Integer order1;
    @RedisQuery
    /** t_navigation.http */
    private String http;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1 == null ? null : desc1.trim();
    }

    public Integer getOrder1() {
        return order1;
    }

    public void setOrder1(Integer order1) {
        this.order1 = order1;
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http == null ? null : http.trim();
    }

	public Navigation(Integer id, String name, String target, String position, String desc1, Integer order1,
			String http) {
		super();
		this.id = id;
		this.name = name;
		this.target = target;
		this.position = position;
		this.desc1 = desc1;
		this.order1 = order1;
		this.http = http;
	}

	public Navigation() {
	
	}
    
}