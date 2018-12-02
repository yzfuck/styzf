package com.styzf.core.common.validation;

/**
 * 正则验证枚举类
 * @author styzf
 * @date 2018年8月7日 
 *
 */
public enum RegEx {
    // 正整数 
    IntegerPositive("^[1-9]d*$", "必须是正整数"),
    // 正整数 
    IntegerNegative("^-[1-9]d*$", "必须是负整数"),
    // 整数 
    Integer("^-?[1-9]d*$", "必须是整数"),
    // 非负整数（正整数 + 0） 
    IntegerNonNegative("^[1-9]d*|0$", "必须是非负整数（正整数 + 0）"),
    // 非正整数（负整数 + 0） 
    IntegerNonPositive("-[1-9]d*|0$", "必须是非正整数（负整数 + 0）"),
    
    // 正浮点数 
    FloatPositive("^(?:[1-9][0-9]*\\.[0-9]+|0\\.(?!0+$)[0-9]+)$", "必须是正浮点数"),
    // 负浮点数  
    FloatNegative("-(?:[1-9][0-9]*\\.[0-9]+|0\\.(?!0+$)[0-9]+)$", "必须是负浮点数"),
    // 浮点数 
    Float("-?([1-9]d*.d*|0.d*[1-9]d*|0?.0+|0)$", "必须是浮点数"),
    // 非负浮点数（正浮点数 + 0） 
    FloatNonNegative("^[1-9]d*.d*|0.d*[1-9]d*|0?.0+|0$", "必须是非负浮点数（正浮点数 + 0）"),
    // 非正浮点数（负浮点数 + 0）
    FloatNonPositive("^[1-9]d*.d*|0.d*[1-9]d*$", "必须是非正浮点数（负浮点数 + 0）"),
    
    // 数字
    Number("^[0-9]*$", "必须是数字"),
    // 非零的正整数
    NumberPositive("^+?[1-9][0-9]*$", "必须是非零的正整数"),
    // 非零的负整数
    NumberNegative("^-[1-9][0-9]*$", "必须是非零的负整数"),
    // n位的数字
    NumberLengthN("^d{n}$", "必须是n位的数字"),
    // 至少n位数字
    NumberMinLengthN("^d{n,}$", "必须是至少n位数字"),
    // m-n位的数字
    NumberLengthMToN("^d{m,n}$", "必须是m-n位的数字"),
    // 零和非零开头的数字
    NumberStart("^(0|[1-9][0-9]*)$", "必须是零和非零开头的数字"),
    // 两位小数的正实数
    NumberCash("^[0-9]+(.[0-9]{2})?$", "必须是两位小数的正实数"),
    
    // 26个英文字母组成的字符串 
    English("^[A-Za-z]+$", "必须是26个英文字母组成的字符串"),
    // 26个英文字母的大写组成的字符串 
    EnglishUpper("^[A-Z]+$", "必须是26个英文字母的大写组成的字符串"),
    // 26个英文字母的小写组成的字符串
    EnglishLower("^[a-z]+$", "必须是26个英文字母的小写组成的字符串"),
    // 数字和26个英文字母组成的字符串 
    EnglishAndNumber("^[A-Za-z0-9]+$", "必须是数字和26个英文字母组成的字符串"),
    // 由数字、26个英文字母或者下划线组成的字符串 
    EnglishNumberAndLine("^w+$", "必须是由数字、26个英文字母或者下划线组成的字符串"),

    // URL
    URL("[a-zA-z]+://[^s]*", "必须是如 http://www.baidu.com"),
    // 国内电话号码
    HomePhone("d{3}-d{8}|d{4}-d{7}", "必须是如 0511-4405222 或 021-87888822"),
    // 手机号码
    CellPhone("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", "必须是如 13545678901"),
    // 国内电话号码
    Phone("((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)", "必须是如：12345678901 或 1234-12345678 或 1234-12345678-1234"),
    // 中国邮政编码
    ChinaPost("[1-9]d{5}(?!d)", "邮政编码必须是6位数字 "),
    // 身份证号
    IdCard("d{15}|d{18}|d{17}x", "身份证必须是15位或18位"),
    // IP地址
    IP("^((25[0-5]|2[0-4]\\d|(1\\d|[1-9])?\\d)\\.){3}(25[0-5]|2[0-4]\\d|(1\\d|[1-9])?\\d)$", "必须是如 192.168.1.1"),
    // QQ
    QQ("[1-9][0-9]{4,}", "腾讯QQ号必须是从10000开始"),
    // Email地址
    Email("w+([-+.]w+)*@w+([-.]w+)*.w+([-.]w+)*", "必须是如 XXX@ly-sky.com"),
    // 日期格式yyyy-MM-dd
    Date("((^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(10|12|0?[13578])([-\\/\\._])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(11|0?[469])([-\\/\\._])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(0?2)([-\\/\\._])(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([3579][26]00)([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([1][89][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$)|(^([2-9][0-9][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)$))", "日期格式必须是yyyy-MM-dd");

    private String context;
    
    private String msg;
    
    private RegEx(String context, String msg) {
        this.context = context;
        this.msg = msg;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
}
