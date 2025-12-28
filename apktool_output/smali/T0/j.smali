.class public final Lt0/j;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final e:Lt0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, Lt0/j;->e:Lt0/j;

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/z;

    invoke-virtual {p1}, Ln0/z;->i()Lt0/g;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lt0/g;->e:Z

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
