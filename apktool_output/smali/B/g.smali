.class public final Lb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lcom/ai/assistance/operit/provider/MainComposeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;I)V
    .locals 0

    iput p2, p0, Lb/g;->d:I

    iput-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 1

    iget p1, p0, Lb/g;->d:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    iget-object p2, p1, Lb/k;->i:Landroidx/lifecycle/I;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb/i;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lb/i;->a:Landroidx/lifecycle/I;

    iput-object p2, p1, Lb/k;->i:Landroidx/lifecycle/I;

    :cond_0
    iget-object p2, p1, Lb/k;->i:Landroidx/lifecycle/I;

    if-nez p2, :cond_1

    new-instance p2, Landroidx/lifecycle/I;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Landroidx/lifecycle/I;-><init>(I)V

    iput-object p2, p1, Lb/k;->i:Landroidx/lifecycle/I;

    :cond_1
    iget-object p1, p1, Lb/k;->g:Landroidx/lifecycle/t;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    return-void

    :pswitch_0
    sget-object p1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    iget-object p1, p1, Lb/k;->e:Ld/a;

    const/4 p2, 0x0

    iput-object p2, p1, Ld/a;->b:Lb/k;

    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-virtual {p1}, Lb/k;->e()Landroidx/lifecycle/I;

    move-result-object p1

    iget-object p1, p1, Landroidx/lifecycle/I;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/G;

    invoke-virtual {v0}, Landroidx/lifecycle/G;->a()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    :cond_3
    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    iget-object p1, p1, Lb/k;->k:Lb/j;

    iget-object p2, p1, Lb/j;->g:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_4
    return-void

    :pswitch_1
    sget-object p1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    if-ne p2, p1, :cond_6

    iget-object p1, p0, Lb/g;->e:Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
