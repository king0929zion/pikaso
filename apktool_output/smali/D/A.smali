.class public final LD/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/V;


# static fields
.field public static final d:LD/A;

.field public static final e:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LD/A;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LD/A;->d:LD/A;

    sget-object v0, Ly2/B;->a:LF2/d;

    sget-object v0, LD2/o;->a:Lz2/c;

    iget-object v0, v0, Lz2/c;->i:Lz2/c;

    new-instance v1, LD/x;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Li2/j;-><init>(ILg2/d;)V

    invoke-static {v0, v1}, Ly2/v;->o(Lz2/c;Lo2/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Choreographer;

    sput-object v0, LD/A;->e:Landroid/view/Choreographer;

    return-void
.end method


# virtual methods
.method public final e(Lg2/h;)Lg2/i;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->H(Lg2/g;Lg2/h;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lg2/i;)Lg2/i;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->K(Lg2/g;Lg2/i;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lg2/h;)Lg2/g;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->w(Lg2/g;Lg2/h;)Lg2/g;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lo2/c;Li2/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ly2/f;

    invoke-static {p2}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {v0}, Ly2/f;->u()V

    new-instance p2, LD/z;

    invoke-direct {p2, p1, v0}, LD/z;-><init>(Lo2/c;Ly2/f;)V

    sget-object p1, LD/A;->e:Landroid/view/Choreographer;

    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, LD/y;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p2}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ly2/f;->x(Lo2/c;)V

    invoke-virtual {v0}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
