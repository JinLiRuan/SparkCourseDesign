# SparkCourseDesign
Spark大数据处理技术的简单课程设计，其中涉及到spark的数据处理和分析以及可视化的知识。。
对原始数据集（共38383条用户评分数据）先进行数据预处理，利用pandas查看缺失值和重复值，然后把处理好的数据集保存到本地，再通过PySpark读取本地数据，使用Spark ALS协同过滤推荐算法分别进行基于用户推荐和基于菜品推荐，把推荐出来的结果存到数据仓库；然后再使用Spark SQL进行数据分析，最后利用PyEcharts把分析的结果进行数据可视化。
所得的可视化结果存储到MySQL数据库，使用Python Web技术（可以使用Django框架）实现结果数据的展示和用户的交互。其它功能可以根据实际情况自由扩展。

![image](https://github.com/JinLiRuan/SparkCourseDesign/assets/74299629/391ff2eb-d61b-44db-bf97-20641a957417)
