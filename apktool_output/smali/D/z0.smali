.class public final LD/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/V;


# static fields
.field public static final d:LD/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD/z0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LD/z0;->d:LD/z0;

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
    .locals 3

    sget-object v0, Ly2/B;->a:LF2/d;

    sget-object v0, LD2/o;->a:Lz2/c;

    new-instance v1, LD/y0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LD/y0;-><init>(Lo2/c;Lg2/d;)V

    invoke-static {v0, v1, p2}, Ly2/v;->s(Lg2/g;Lo2/e;Li2/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
