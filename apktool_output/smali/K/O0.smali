.class public final Lk/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk/O0;->d:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/O0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk/U0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk/O0;->d:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/O0;->e:Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lk/U0;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lk/O0;->d:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lk/O0;->e:Ljava/lang/Object;

    check-cast p1, Lk/U0;

    iget-object v0, p1, Lk/U0;->k:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lk/O0;->e:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->N:Lk/Q0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lk/Q0;->e:Lj/j;

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lj/j;->collapseActionView()Z

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
