function getScreenVisibleHeight() {
	var clientHeight = 0;
	if (document.body.clientHeight && document.documentElement.clientHeight) {
		var clientHeight = (document.body.clientHeight < document.documentElement.clientHeight) ? document.body.clientHeight
				: document.documentElement.clientHeight;
	} else {
		var clientHeight = (document.body.clientHeight > document.documentElement.clientHeight) ? document.body.clientHeight
				: document.documentElement.clientHeight;
	}
	return clientHeight;
}

function adjustContentDividerHeight() {
	var leftContentHeight = $('.content-left').height();
	var rightContentHeight = $('.content-right').height();
	var dividerHeight = Math.max(leftContentHeight, rightContentHeight);
	$('.content-divider').height(dividerHeight);
}

$(function() {
	adjustContentDividerHeight();

	$('.content-left').resize(function() {
		adjustContentDividerHeight();
	})

	$('.content-right').resize(function() {
		adjustContentDividerHeight();
	})
});
