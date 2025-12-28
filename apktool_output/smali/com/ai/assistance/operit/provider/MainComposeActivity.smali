.class public final Lcom/ai/assistance/operit/provider/MainComposeActivity;
.super Lb/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lb/k;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LG1/c;->b:LL/a;

    sget-object v0, Lc/a;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lo0/e0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lo0/e0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Lo0/a;->setParentCompositionContext(LD/q;)V

    invoke-virtual {v0, p1}, Lo0/e0;->setContent(Lo2/e;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lo0/e0;

    invoke-direct {v0, p0}, Lo0/e0;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;)V

    invoke-virtual {v0, v2}, Lo0/a;->setParentCompositionContext(LD/q;)V

    invoke-virtual {v0, p1}, Lo0/e0;->setContent(Lo2/e;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Landroidx/lifecycle/E;->b(Landroid/view/View;)Landroidx/lifecycle/r;

    move-result-object v1

    if-nez v1, :cond_2

    const v1, 0x7f0801be

    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_2
    sget-object v1, Landroidx/lifecycle/K;->h:Landroidx/lifecycle/K;

    invoke-static {p1, v1}, Lw2/h;->Y(Ljava/lang/Object;Lo2/c;)Lw2/f;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/K;->i:Landroidx/lifecycle/K;

    invoke-static {v1, v2}, Lw2/h;->Z(Lw2/f;Lo2/c;)Lw2/d;

    move-result-object v1

    invoke-static {v1}, Lw2/h;->X(Lw2/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/J;

    if-nez v1, :cond_3

    const v1, 0x7f0801c1

    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_3
    sget-object v1, LA1/h;->f:LA1/h;

    invoke-static {p1, v1}, Lw2/h;->Y(Ljava/lang/Object;Lo2/c;)Lw2/f;

    move-result-object v1

    sget-object v2, LA1/h;->g:LA1/h;

    invoke-static {v1, v2}, Lw2/h;->Z(Lw2/f;Lo2/c;)Lw2/d;

    move-result-object v1

    invoke-static {v1}, Lw2/h;->X(Lw2/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA1/g;

    if-nez v1, :cond_4

    const v1, 0x7f0801c0

    invoke-virtual {p1, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    sget-object p1, Lc/a;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, p1}, Lb/k;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    return-void
.end method
