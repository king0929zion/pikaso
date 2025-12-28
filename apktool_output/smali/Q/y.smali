.class public final Lq/y;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final e:Lq/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq/y;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, Lq/y;->e:Lq/y;

    return-void
.end method


# virtual methods
.method public final bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/n;

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
