.class public final LD1/e;
.super LD1/p;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD1/e;->b:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    iput-boolean p1, p0, LD1/e;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LD1/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr2/a;->a0(Landroid/view/ViewGroup;Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LD1/e;->a:Z

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, LD1/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr2/a;->a0(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final d(LD1/o;)V
    .locals 2

    iget-boolean v0, p0, LD1/e;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LD1/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr2/a;->a0(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, LD1/o;->u(LD1/n;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LD1/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lr2/a;->a0(Landroid/view/ViewGroup;Z)V

    return-void
.end method
