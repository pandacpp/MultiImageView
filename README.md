# MultiImageView
### 仿照微信朋友圈图片展示
Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.pandacpp:MultiImageView:1.0.0'
	}
