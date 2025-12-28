.class public final LG1/l;
.super LG1/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;


# direct methods
.method public constructor <init>(Lcom/ai/assistance/operit/provider/UIAccessibilityService;)V
    .locals 0

    iput-object p1, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-direct {p0}, LG1/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u51c6\u5907\u5728 ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") \u6267\u884c\u957f\u6309..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UIAccessibilityService"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-virtual {v3, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v3, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance p1, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x258

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJ)V

    new-instance p2, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {p2}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    invoke-virtual {p2, p1}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object p1

    new-instance p2, LG1/j;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, LG1/j;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v1, p1, p2, v0}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    move-result p1

    return p1
.end method

.method public final b(I)Z
    .locals 1

    iget-object v0, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v0, p1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    move-result p1

    return p1
.end method

.method public final c(II)Z
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u51c6\u5907\u5728 ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") \u6267\u884c\u70b9\u51fb..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UIAccessibilityService"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-virtual {v3, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v3, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance p1, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x32

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJ)V

    new-instance p2, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {p2}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    invoke-virtual {p2, p1}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object p1

    new-instance p2, LG1/j;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, LG1/j;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v1, p1, p2, v0}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    move-result p1

    return p1
.end method

.method public final e()Z
    .locals 1

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    return v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const-string v0, "setTextOnNode: performAction(ACTION_SET_TEXT) \u5728\u76ee\u6807\u8282\u70b9\u4e0a\u8fd4\u56de false. \u8282\u70b9\u4fe1\u606f: class="

    const-string v1, "setTextOnNode \u5931\u8d25: \u5728\u8282\u70b9 "

    const-string v2, "nodeId"

    invoke-static {p1, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "text"

    invoke-static {p2, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u51c6\u5907\u4e3a\u8282\u70b9 "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u8bbe\u7f6e\u6587\u672c: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UIAccessibilityService"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v2}, Landroid/accessibilityservice/AccessibilityService;->getRootInActiveWindow()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const-string p1, "setTextOnNode \u5931\u8d25: rootInActiveWindow is null"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_0
    invoke-static {v2, p1}, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->b(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    if-nez v5, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "setTextOnNode \u5931\u8d25: \u65e0\u6cd5\u901a\u8fc7ID \'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' \u627e\u5230\u76ee\u6807\u5bb9\u5668\u8282\u70b9"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    :cond_1
    :try_start_0
    invoke-static {v5}, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->a(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_2

    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \u53ca\u5176\u5b50\u8282\u70b9\u4e2d\u672a\u627e\u5230\u53ef\u7f16\u8f91\u7684\u8282\u70b9\u3002"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    return v4

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    :try_start_2
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v1, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {p1, v1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const/high16 p2, 0x200000

    invoke-virtual {v2, p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v2, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text=\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\', bounds="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    return p1

    :catchall_1
    move-exception p1

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    :cond_4
    throw p1
.end method

.method public final g()Ljava/lang/String;
    .locals 6

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    iget-object v0, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v0}, Landroid/accessibilityservice/AccessibilityService;->getRootInActiveWindow()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v2

    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-interface {v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/Writer;)V

    const-string v4, "UTF-8"

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v4, v5}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-static {v0, v2}, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Lorg/xmlpull/v1/XmlSerializer;)V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :goto_0
    throw v0

    :goto_1
    const-string v2, "UIAccessibilityService"

    const-string v3, "\u751f\u6210UI XML\u65f6\u51fa\u9519"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-object v1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    const-string v0, "path"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    new-instance v0, Lp2/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "toLowerCase(...)"

    invoke-static {p2, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    iget-object v3, v1, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->d:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, v1, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->e:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v6, v6, v4

    if-gtz v6, :cond_1

    iget-wide v6, v1, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->f:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v8, v4, v6

    if-gez v8, :cond_1

    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :cond_1
    :goto_0
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v1, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->e:J

    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-static {v1}, LD1/t;->p(Lcom/ai/assistance/operit/provider/UIAccessibilityService;)Ljava/util/concurrent/Executor;

    move-result-object v5

    new-instance v6, LG1/k;

    invoke-direct {v6, p1, p2, v0, v4}, LG1/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lp2/m;Ljava/util/concurrent/CountDownLatch;)V

    invoke-static {v1, v5, v6}, LG1/i;->s(Lcom/ai/assistance/operit/provider/UIAccessibilityService;Ljava/util/concurrent/Executor;Landroid/accessibilityservice/AccessibilityService$TakeScreenshotCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    iput-boolean v2, v0, Lp2/m;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    monitor-exit v3

    iget-boolean p1, v0, Lp2/m;->d:Z

    return p1

    :goto_2
    monitor-exit v3

    throw p1
.end method

.method public final i(IIIIJ)Z
    .locals 6

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-virtual {v1, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    int-to-float p1, p3

    int-to-float p2, p4

    invoke-virtual {v1, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance p1, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v2, 0x0

    move-object v0, p1

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJ)V

    new-instance p2, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {p2}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    invoke-virtual {p2, p1}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object p1

    iget-object p2, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3, p3}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    move-result p1

    return p1
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v1, v0}, Landroid/accessibilityservice/AccessibilityService;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/accessibilityservice/AccessibilityService;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V

    invoke-virtual {v1}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
