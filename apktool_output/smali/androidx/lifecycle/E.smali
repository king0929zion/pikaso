.class public abstract Landroidx/lifecycle/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/H;


# static fields
.field public static final d:LX1/e;

.field public static final e:LX1/e;

.field public static final f:LX1/e;

.field public static final g:LX1/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, LX1/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/E;->d:LX1/e;

    new-instance v0, LX1/e;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/E;->e:LX1/e;

    new-instance v0, LX1/e;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/E;->f:LX1/e;

    new-instance v0, LX1/e;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/E;->g:LX1/e;

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/lifecycle/r;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/r;

    invoke-interface {p0}, Landroidx/lifecycle/r;->c()Landroidx/lifecycle/t;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_0
    return-void
.end method

.method public static final b(Landroid/view/View;)Landroidx/lifecycle/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/K;->f:Landroidx/lifecycle/K;

    invoke-static {p0, v0}, Lw2/h;->Y(Ljava/lang/Object;Lo2/c;)Lw2/f;

    move-result-object p0

    sget-object v0, Landroidx/lifecycle/K;->g:Landroidx/lifecycle/K;

    invoke-static {p0, v0}, Lw2/h;->Z(Lw2/f;Lo2/c;)Lw2/d;

    move-result-object p0

    invoke-static {p0}, Lw2/h;->X(Lw2/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/r;

    return-object p0
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/lifecycle/C;->Companion:Landroidx/lifecycle/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/lifecycle/C;

    invoke-direct {v0}, Landroidx/lifecycle/C;-><init>()V

    invoke-static {p0, v0}, LZ/h;->e(Landroid/app/Activity;Landroidx/lifecycle/C;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/D;

    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method
