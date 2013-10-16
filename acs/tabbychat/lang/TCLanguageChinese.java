package acs.tabbychat.lang;

import java.util.Properties;

public class TCLanguageChinese extends TCLanguage {
        protected static String provides;
        protected final static Properties defaults = new Properties();
        static {
                provides = "zh_CN";
                defaults.clear();
                // Chinese, from emotcc
                // Chinese STRINGS FOR DELIMITERS
                defaults.setProperty("delims.angles", "<尖括号>");
                defaults.setProperty("delims.braces", "{大括号}");
                defaults.setProperty("delims.brackets", "[方括号]");
                defaults.setProperty("delims.parenthesis", "(括号)");
                defaults.setProperty("delims.anglesparenscombo", "<(组合)Pl.>");
                defaults.setProperty("delims.anglesbracketscombo", "<[组合]Pl.>");
                
                // Chinese STRINGS FOR COLORS
                defaults.setProperty("colors.default", "标准(白色)");
                defaults.setProperty("colors.darkblue", "深蓝色");
                defaults.setProperty("colors.darkgreen", "深绿色");
                defaults.setProperty("colors.darkaqua", "湖蓝色");
                defaults.setProperty("colors.darkred", "深红色");
                defaults.setProperty("colors.purple", "紫色");
                defaults.setProperty("colors.gold", "金色");
                defaults.setProperty("colors.gray", "灰色");
                defaults.setProperty("colors.darkgray", "深灰色");
                defaults.setProperty("colors.indigo", "靛蓝色");
                defaults.setProperty("colors.brightgreen", "鲜绿色");
                defaults.setProperty("colors.aqua", "水蓝色");
                defaults.setProperty("colors.red", "红色");
                defaults.setProperty("colors.pink", "粉色");
                defaults.setProperty("colors.yellow", "黄色");
                defaults.setProperty("colors.white", "白色");
                
                // Chinese STRINGS FOR FORMATS
                defaults.setProperty("formats.default", "标准");
                defaults.setProperty("formats.bold", "粗体");
                defaults.setProperty("formats.striked", "删除线");
                defaults.setProperty("formats.underline", "下划线");
                defaults.setProperty("formats.italic", "斜体");
                
                // Chinese STRINGS FOR SOUNDS
                defaults.setProperty("sounds.orb", "经验球");
                defaults.setProperty("sounds.anvil", "铁砧");
                defaults.setProperty("sounds.bowhit", "弓射击");
                defaults.setProperty("sounds.break", "破损");
                defaults.setProperty("sounds.click", "点击");
                defaults.setProperty("sounds.glass", "玻璃");
                defaults.setProperty("sounds.bass", "低音");
                defaults.setProperty("sounds.harp", "竖琴");
                defaults.setProperty("sounds.pling", "Pling");
                defaults.setProperty("sounds.cat", "猫");
                defaults.setProperty("sounds.blast", "爆炸");
                defaults.setProperty("sounds.splash", "噗通");
                defaults.setProperty("sounds.swim", "游泳");
                defaults.setProperty("sounds.bat", "蝙蝠");
                defaults.setProperty("sounds.blaze", "烈焰人");
                defaults.setProperty("sounds.chicken", "鸡");
                defaults.setProperty("sounds.cow", "牛");
                defaults.setProperty("sounds.dragon", "末影龙");
                defaults.setProperty("sounds.endermen", "末影人");
                defaults.setProperty("sounds.ghast", "恶魂");
                defaults.setProperty("sounds.pig", "猪");
                defaults.setProperty("sounds.wolf", "狼");
                
                // Chinese STRINGS FOR SETTINGS - COMMON
                defaults.setProperty("settings.save", "保存");
                defaults.setProperty("settings.cancel", "取消");
                defaults.setProperty("settings.new", "新建");
                defaults.setProperty("settings.delete", "删除");
                
                // Chinese STRINGS FOR SETTINGS - 'GENERAL CONFIG'
                defaults.setProperty("settings.general.name", "常规设置");
                defaults.setProperty("settings.general.tabbychatenable", "启用 TabbyChat");
                defaults.setProperty("settings.general.savechatlog", "保存聊天记录");
                defaults.setProperty("settings.general.timestampenable", "开启聊天时间标记");
                defaults.setProperty("settings.general.timestampstyle", "时间标记 - 格式");
                defaults.setProperty("settings.general.timestampcolor", "时间标记 - 颜色");
                defaults.setProperty("settings.general.groupspam", "垃圾邮件总体");
                defaults.setProperty("settings.general.unreadflashing", "默认未读信息闪烁");
                defaults.setProperty("settings.general.spellcheckenable", "启用拼写检查");
                
                // Chinese STRING FOR SETTINGS - 'SERVER CONFIG'
                defaults.setProperty("settings.server.name", "服务器设置");
                defaults.setProperty("settings.server.autochannelsearch", "自动搜索新的频道");
                defaults.setProperty("settings.server.autopmsearch", "自动搜索新的私密消息");
                defaults.setProperty("settings.server.delimiterchars", "聊天频道分隔符");
                defaults.setProperty("settings.server.delimcolorbool", "分隔符 - 颜色");
                defaults.setProperty("settings.server.delimformatbool", "分隔符 - 格式");
                defaults.setProperty("settings.server.defaultchannels", "默认频道");
                defaults.setProperty("settings.server.ignoredchannels", "忽略频道");
                
                // Chinese STRING FOR SETTINGS - 'CUSTOM FILTERS'
                defaults.setProperty("settings.filters.name", "筛选器设置");
                defaults.setProperty("settings.filters.inversematch", "逆向匹配");
                defaults.setProperty("settings.filters.casesensitive", "区分大小写");
                defaults.setProperty("settings.filters.highlightbool", "高亮度匹配");
                defaults.setProperty("settings.filters.highlightcolor", "颜色");
                defaults.setProperty("settings.filters.highlightformat", "格式");
                defaults.setProperty("settings.filters.audionotificationbool", "音频提示");
                defaults.setProperty("settings.filters.audionotificationsound", "声音");
                defaults.setProperty("settings.filters.filtername", "筛选器名称");
                defaults.setProperty("settings.filters.sendtotabbool", "发送匹配标签");
                defaults.setProperty("settings.filters.sendtotabname", "标签名称");
                defaults.setProperty("settings.filters.sendtoalltabs", "所有标签");
                defaults.setProperty("settings.filters.removematches", "从隐藏的聊天中匹配");
                defaults.setProperty("settings.filters.expressionstring", "表达式");
                
                // Chinese STRINGS FOR SETTINGS - 'ADVANCED SETTINGS'
                defaults.setProperty("settings.advanced.name", "高级设置");
                defaults.setProperty("settings.advanced.chatscrollhistory", "聊天记录保留 (条)");
                defaults.setProperty("settings.advanced.maxlengthchannelname", "频道名称最大长度");
                defaults.setProperty("settings.advanced.multichatdelay", "多聊天发送延迟时间 (毫秒)");
                defaults.setProperty("settings.advanced.chatboxunfocheight", "焦点高度");
                defaults.setProperty("settings.advanced.chatfadeticks", "聊天淡入淡出时间 (ticks)");
                defaults.setProperty("settings.advanced.forceunicode", "强制 Unicode编码 渲染聊天");
                defaults.setProperty("settings.advanced.textignoreopacity", "文字不透明度设置");
                
                // Chinese STRINGS FOR SETTINGS - CHAT CHANNEL
                defaults.setProperty("settings.channel.notificationson", "未读通知");
                defaults.setProperty("settings.channel.alias", "别名");
                defaults.setProperty("settings.channel.cmdprefix", "聊天命令前缀");
                defaults.setProperty("settings.channel.position", "位置:");
                defaults.setProperty("settings.channel.of", "至");
                defaults.setProperty("settings.channel.hideprefix", "打字时隐藏命令前缀");
                
                // Chinese STRINGS FOR MESSAGES
                defaults.setProperty("messages.update1", "有可用的更新! (现在的版本是 ");
                defaults.setProperty("messages.update2", ", 最新版是 ");
                defaults.setProperty("messages.update3", "请访问论坛 minecraftforum.net 中的 TabbyChat 主题帖中下载");
        }
}
