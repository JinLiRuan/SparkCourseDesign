/**
 * 
 * 获取职位全国分布数据生成饼状图
 */
function city(){
	var JsonSeries = [];
	document.getElementById("dataView").className = 'general';
	var dataViewcharts
		=echarts.init(document.getElementById('dataView'));
	var dataViewoption = {
	 title : {
	        text: '评分人数分布',
	        subtext: '',
	        x:'center'
	    },
	    tooltip : {
	        trigger: 'item',
	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	    },
	    legend: {
	        orient : 'vertical',
	        x : 'left',
	        data:[]
	    },
	    toolbox: {
	        show : true,
	        feature : {
	            mark : {show: true},
	            dataView : {show: true, readOnly: false},
	            magicType : {
	                show: true, 
	                type: ['pie', 'funnel'],
	                option: {
	                    funnel: {
	                        x: '25%',
	                        width: '50%',
	                        funnelAlign: 'left',
	                        max: 1548
	                    }
	                }
	            },
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    calculable : true,
	    series : [
	        {
	            name:'评分人数分布',
	            type:'pie',
	            radius : '55%',
	            center: ['50%', '60%'],
	            data:[]
	        }]
		};
	// 异步加载数据
	$.get('http://localhost:8080/job-web/city').done(function(data) {
		data.forEach(function(element) {
			JsonSeries.push(JSON.parse(element));	
		});
		dataViewoption.series[0].data = JsonSeries;
		dataViewoption.legend.data = JsonSeries;
		dataViewcharts.clear();
		dataViewcharts.setOption(dataViewoption);
	});		
}

/**
 * 
 * 获取工资分段数据生成柱状图
 */
function salary(){
	document.getElementById("dataView").className = 'general';
	var dataViewcharts
		=echarts.init(document.getElementById('dataView'));
		var dataViewoption = {
				 title : {
				        text: '全部菜品销售top10',
				        subtext: ''
				    },
				    tooltip : {
				        trigger: 'axis'
				    },
				    legend: {
				        data:['菜品销售']
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            mark : {show: true},
				            dataView : {show: true, readOnly: false},
				            magicType : {show: true, type: ['line', 'bar']},
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',
				            data : []
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value'
				        }
				    ],
				    series : [
				        {
				            name:'销售量',
				            type:'bar',
				            data:[],
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				                    {type : 'min', name: '最小值'}
				                ]
				            }
				        }]
			};
	var JsonxAxis = [];
	var JsonSeries = [];	
	// 异步加载数据
	$.get('http://localhost:8080/job-web/salary').done(function(data) {
		data.forEach(function(element) {
			for(var key in JSON.parse(element)){
				if(key == 'name'){
					JsonxAxis.push(JSON.parse(element)[key]);
				}else{
					JsonSeries.push(JSON.parse(element)[key]);
				}		
			}
		});
		dataViewoption.xAxis[0].data = JsonxAxis;
		dataViewoption.series[0].data = JsonSeries;
		dataViewcharts.clear();
		dataViewcharts.setOption(dataViewoption);
	});	
}
/**
 * 
 * 获取福利标签数据生成词云
 */
function company(){
	document.getElementById("dataView").className = 'general';
	var dataViewcharts
		=echarts.init(document.getElementById('dataView'));
		var dataViewoption = {
			    title: {
			        text: '菜品名称词云',
			        x: 'center',
			        textStyle: {
			            fontSize: 23,
			            color:'#FFFFFF'
			        }
			    },
			    tooltip: {
			        show: true
			    },
			    series: [{
			        name: '菜品名称词云分布',
			        type: 'wordCloud',
			        sizeRange: [6, 66],
			        rotationRange: [-45, 90],
			        textPadding: 0,
			        autoSize: {
			            enable: true,
			            minSize: 6
			        },
			        textStyle: {
			            normal: {
			                color: function() {
			                    return 'rgb(' + [
			                        Math.round(Math.random() * 160),
			                        Math.round(Math.random() * 160),
			                        Math.round(Math.random() * 160)
			                    ].join(',') + ')';
			                }
			            },
			            emphasis: {
			                shadowBlur: 10,
			                shadowColor: '#333'
			            }
			        },
			        data: []
			    }]
			};
	var JosnList = [];
	
	// 异步加载数据
	$.get('http://localhost:8080/job-web/company').done(function(data) {
		data.forEach(function(element) {
			JosnList.push(JSON.parse(element));
			});
		dataViewoption.series[0].data = JosnList;
		dataViewcharts.clear();
		dataViewcharts.setOption(dataViewoption);
	});	
}
/**
 * 
 * 获取技能标签数据生成词云
 */
function kill(){
	document.getElementById("dataView").className = 'general';
	var dataViewcharts
		=echarts.init(document.getElementById('dataView'));
		var dataViewoption = {
			    title: {
			        text: '用户评论菜品词云展示',
			        x: 'center',
			        textStyle: {
			            fontSize: 23,
			            color:'#FFFFFF'
			        }
			    },
			    tooltip: {
			        show: true
			    },
			    series: [{
			        name: '用户评价',
			        type: 'wordCloud',
			        sizeRange: [6, 66],
			        rotationRange: [-45, 90],
			        textPadding: 0,
			        autoSize: {
			            enable: true,
			            minSize: 6
			        },
			        textStyle: {
			            normal: {
			                color: function() {
			                    return 'rgb(' + [
			                        Math.round(Math.random() * 160),
			                        Math.round(Math.random() * 160),
			                        Math.round(Math.random() * 160)
			                    ].join(',') + ')';
			                }
			            },
			            emphasis: {
			                shadowBlur: 10,
			                shadowColor: '#333'
			            }
			        },
			        data: []
			    }]
			};
	var JosnList = [];
	
	// 异步加载数据
	$.get('http://localhost:8080/job-web/kill').done(function(data) {
		data.forEach(function(element) {
			JosnList.push(JSON.parse(element));
			});
		dataViewoption.series[0].data = JosnList;
		dataViewcharts.clear();
		dataViewcharts.setOption(dataViewoption);
	});	
}
