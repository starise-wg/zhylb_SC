# Eclipse下spingClound和Docker的使用
##  一：环境搭建
###step1：eclipse安装DockerTools插件

	使用eclipse自带的软件市场进行安装
	
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/eclipse%E5%AE%89%E8%A3%85Doucker%20Tools%E5%B7%A5%E5%85%B7.png"width="50%" height="50%"></div>

###step2:安装Docker Windowns版本
####1：win7、win8下安装docker

win7、win8 等需要利用 docker toolbox 来安装，国内可以使用阿里云的镜像来下载，下载地址：http://mirrors.aliyun.com/docker-toolbox/windows/docker-toolbox/

docker toolbox 是一个工具集，它主要包含以下一些内容：

	Docker CLI 客户端，用来运行docker引擎创建镜像和容器
	Docker Machine. 可以让你在windows的命令行中运行docker引擎命令
	Docker Compose. 用来运行docker-compose命令
	Kitematic. 这是Docker的GUI版本
	Docker QuickStart shell. 这是一个已经配置好Docker的命令行环境
	Oracle VM Virtualbox. 虚拟机

下载完成之后直接点击安装，安装成功后，桌边会出现三个图标，入下图所示：

<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20190331122322.png"></div>

####2：win10下安装docker
现在 Docker 有专门的 Win10 专业版系统的安装包，需要开启Hyper-V

最新版 Toolbox 下载地址： https://www.docker.com/get-docker
点击 Get Docker Community Edition，并下载 Windows 的版本：

<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/Docker%E4%B8%8B%E8%BD%BD%E9%A1%B5%E9%9D%A2.jpg"></div>

##二：微服务代码编写及Docker配置
###1：微服务代码编写
根据微服务各组件进行微服务基础框架的搭建
基础框架代码下载链接：[https://github.com/starise-wg/zhylb_SC.git](https://github.com/starise-wg/zhylb_SC.git)
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E5%BE%AE%E6%9C%8D%E5%8A%A1%E4%BB%A3%E7%A0%811.png" width="80%" height="50%"></div> 

###2:Docker容器配置
####Step1：在maven中配置spotify插件
spotify插件相关学习见：https://my.oschina.net/eacdy/blog/1648300
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/spotify%E6%8F%92%E4%BB%B6%E9%85%8D%E7%BD%AE.png" width="80%" height="50%"></div>

####Step2：在targer目录下新增dockerfile文件
dockerfile文件相关知识请访问：https://blog.csdn.net/u011781521/article/details/80464065

<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/dockerfile%E6%96%87%E4%BB%B6.png" width="80%" height="50%"></div>

####Step3：镜像构建
在eclipse中使用docker tools工具进行本地镜像构建
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E6%9C%AC%E5%9C%B0%E9%95%9C%E5%83%8F%E6%9E%84%E5%BB%BA.png" width="80%" height="50%"></div>

####Step4：镜像推送至镜像仓库【两种方式】
方式一：命令行工具
#####1：开启虚拟机
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E5%BC%80%E5%90%AF%E8%99%9A%E6%8B%9F%E6%9C%BA1.png" width="80%" height="50%"></div>

#####2：使用命令进行上传
	docker login --username=wg@starise.com.cn registry.cn-shenzhen.aliyuncs.com  登录链接远程仓库
	docker tag df289be3d57b  registry.cn-shanghai.aliyuncs.com/zhylb/zhylb-wg:eureka7001-V1.0.0  为镜像仓库打标签
	docker push registry.cn-shanghai.aliyuncs.com/zhylb/zhylb-wg:eureka7001-V1.0.0  推送镜像仓库至远程服务器
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E8%BF%9E%E6%8E%A5%E4%BB%93%E5%BA%93%E5%B9%B6push%E9%95%9C%E5%83%8F%E5%88%B0%E9%95%9C%E5%83%8F%E4%BB%93%E5%BA%93.png" width="80%" height="50%"></div>
在镜像仓库中查看所有镜像
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/eureka-V1.0%2C1.png" width="80%" height="50%"></div>

方式二：eclipse下docker tools工具--自行学习
#####1：开启虚拟机
#####2：使用docker tools工具

方式二：
####Step5：拉取镜像仓库至服务器
	docker login --username=wg@starise.com.cn registry.cn-shenzhen.aliyuncs.com  登录链接远程仓库
	docker pull registry.cn-shanghai.aliyuncs.com/zhylb/zhylb-wg:eureka7001-V1.0.0 拉取远程仓库镜像
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E6%8B%89%E5%8F%96%E9%95%9C%E5%83%8F%E4%BB%93%E5%BA%93.png" width="80%" height="50%"></div>

####Step6：启动镜像仓库--使用命令进行镜像仓库拉取
	docker run -d --name "eureka-7001" -p 7001:7001  df289be3d
<div align=center>
<img src="https://raw.githubusercontent.com/starise-wg/images/Springclound%2BDocker/%E6%8B%89%E5%8F%96%E9%95%9C%E5%83%8F%E4%BB%93%E5%BA%93.png" width="80%" height="50%"></div>



