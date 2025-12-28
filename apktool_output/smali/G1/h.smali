.class public final LG1/h;
.super LG1/d;
.source "SourceFile"


# virtual methods
.method public final a(II)Z
    .locals 2

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string p2, "performLongPress: Accessibility Service not connected."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LG1/l;->a(II)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final b(I)Z
    .locals 2

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string v0, "performGlobalAction: Accessibility Service not connected."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    iget-object v0, v0, LG1/l;->a:Lcom/ai/assistance/operit/provider/UIAccessibilityService;

    invoke-virtual {v0, p1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final c(II)Z
    .locals 2

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string p2, "performClick: Accessibility Service not connected."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LG1/l;->c(II)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    if-nez v0, :cond_0

    const-string v0, "RemoteBinderService"

    const-string v1, "getCurrentActivityName: Accessibility Service not connected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ""

    return-object v0

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    return v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "nodeId"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string p2, "setTextOnNode: Accessibility Service not connected."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LG1/l;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const-string v1, ""

    if-nez v0, :cond_0

    const-string v0, "RemoteBinderService"

    const-string v2, "getUiHierarchy: Accessibility Service not connected."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LG1/l;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    return-object v1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "path"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string p2, "takeScreenshot: Accessibility Service not connected."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LG1/l;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final i(IIIIJ)Z
    .locals 9

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RemoteBinderService"

    const-string p2, "performSwipe: Accessibility Service not connected."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    sget-object v2, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v2, :cond_1

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-wide v7, p5

    invoke-virtual/range {v2 .. v8}, LG1/l;->i(IIIIJ)Z

    move-result v1

    :cond_1
    return v1
.end method

.method public final j()Ljava/lang/String;
    .locals 3

    sget-boolean v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "RemoteBinderService"

    const-string v2, "findFocusedNodeId: Accessibility Service not connected."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    sget-object v0, Lcom/ai/assistance/operit/provider/UIAccessibilityService;->i:LG1/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LG1/l;->j()Ljava/lang/String;

    move-result-object v1

    :cond_1
    return-object v1
.end method
