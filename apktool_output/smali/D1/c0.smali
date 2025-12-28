.class public final Ld1/c0;
.super Ld1/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld1/b0;-><init>()V

    return-void
.end method

.method public constructor <init>(Ld1/l0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld1/b0;-><init>(Ld1/l0;)V

    return-void
.end method


# virtual methods
.method public c(ILV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, Ld1/k0;->a(I)I

    move-result p1

    invoke-virtual {p2}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LG1/i;->q(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
