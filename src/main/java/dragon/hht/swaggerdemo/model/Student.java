package dragon.hht.swaggerdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 实体类.
 *
 * @author: huang
 * Date: 18-1-14
 */
@ApiModel("用户实体模型")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @ApiModelProperty("学生ID")
    public int id;
    @ApiModelProperty("学生名")
    public String name;
    @ApiModelProperty("年龄")
    public int age;
}
